/**
 * GuaranteeDocumentServiceSoap11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.service.security;

public class GuaranteeDocumentServiceSoap11BindingStub extends org.apache.axis.client.Stub implements rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendAdvancePaymentInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "advancePaymentInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfoRequest"), rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfoResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTenderInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "tenderInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderInfoRequest"), rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderInfoResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendBidSecurityInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "bidSecurityInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfoRequest"), rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfoResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "contractInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoRequest"), rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendCreditLineFacility");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "creditLineFacilityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityRequest"), rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendPerformSecurityInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "performanceSecurityInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfoRequest"), rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfoResponse"));
        oper.setReturnClass(rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public GuaranteeDocumentServiceSoap11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GuaranteeDocumentServiceSoap11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GuaranteeDocumentServiceSoap11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "LOTInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.LOTInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderInfoRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderInfoResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderLOTInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderNotificationInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.bank.xsd.TenderNotificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfoRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfoResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfoRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfoResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ContractInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "IssueBankInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "LOTInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfoRequest");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfoResponse");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ProcuringEntityInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "SupplierInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "TenderNotificationInfo");
            cachedSerQNames.add(qName);
            cls = rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse sendAdvancePaymentInformation(rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest advancePaymentInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendAdvancePaymentInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "sendAdvancePaymentInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {advancePaymentInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse getTenderInformation(rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest tenderInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getTenderInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "getTenderInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tenderInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse sendBidSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest bidSecurityInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendBidSecurityInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "sendBidSecurityInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bidSecurityInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse getContractInformation(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest contractInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getContractInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "getContractInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contractInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse sendCreditLineFacility(rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityRequest creditLineFacilityRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendCreditLineFacility");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "sendCreditLineFacility"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creditLineFacilityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse sendPerformSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest performanceSecurityInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendPerformSecurityInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.service.hub.roneps.minecofin.rw", "sendPerformSecurityInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {performanceSecurityInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
