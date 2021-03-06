package rw.co.snw.web.rest;
import rw.co.snw.service.BranchService;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.BranchDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Branch.
 */
@RestController
@RequestMapping("/api")
public class BranchResource {

    private final Logger log = LoggerFactory.getLogger(BranchResource.class);

    private static final String ENTITY_NAME = "branch";

    private final BranchService branchService;

    public BranchResource(BranchService branchService) {
        this.branchService = branchService;
    }

    /**
     * POST  /branches : Create a new branch.
     *
     * @param branchDTO the branchDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new branchDTO, or with status 400 (Bad Request) if the branch has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/branches")
    public ResponseEntity<BranchDTO> createBranch(@RequestBody BranchDTO branchDTO) throws URISyntaxException {
        log.debug("REST request to save Branch : {}", branchDTO);
        if (branchDTO.getId() != null) {
            throw new BadRequestAlertException("A new branch cannot already have an ID", ENTITY_NAME, "idexists");
        }
        BranchDTO result = branchService.save(branchDTO);
        return ResponseEntity.created(new URI("/api/branches/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /branches : Updates an existing branch.
     *
     * @param branchDTO the branchDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated branchDTO,
     * or with status 400 (Bad Request) if the branchDTO is not valid,
     * or with status 500 (Internal Server Error) if the branchDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/branches")
    public ResponseEntity<BranchDTO> updateBranch(@RequestBody BranchDTO branchDTO) throws URISyntaxException {
        log.debug("REST request to update Branch : {}", branchDTO);
        if (branchDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        BranchDTO result = branchService.save(branchDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, branchDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /branches : get all the branches.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of branches in body
     */
    @GetMapping("/branches")
    public ResponseEntity<List<BranchDTO>> getAllBranches(Pageable pageable) {
        log.debug("REST request to get a page of Branches");
        Page<BranchDTO> page = branchService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/branches");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /branches/:id : get the "id" branch.
     *
     * @param id the id of the branchDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the branchDTO, or with status 404 (Not Found)
     */
    @GetMapping("/branches/{id}")
    public ResponseEntity<BranchDTO> getBranch(@PathVariable Long id) {
        log.debug("REST request to get Branch : {}", id);
        Optional<BranchDTO> branchDTO = branchService.findOne(id);
        return ResponseUtil.wrapOrNotFound(branchDTO);
    }

    /**
     * DELETE  /branches/:id : delete the "id" branch.
     *
     * @param id the id of the branchDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/branches/{id}")
    public ResponseEntity<Void> deleteBranch(@PathVariable Long id) {
        log.debug("REST request to delete Branch : {}", id);
        branchService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
