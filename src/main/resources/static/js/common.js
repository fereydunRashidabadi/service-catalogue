function destroyOldObject() {
    // alert(0)
    if (typeof welcomeLabel !== 'undefined')
        welcomeLabel.destroy();
    // alert(1)
    if (typeof companyLayout !== 'undefined')
        companyLayout.destroy()
    // alert(2)
    if (typeof endpointLayout !== 'undefined')
        endpointLayout.destroy()
    // alert(3)
    if (typeof projectLayout !== 'undefined')
        projectLayout.destroy()
    // alert(4)
}

var serverIp='10.5.18.37';
var serverPort='4444';
var serverProtocol='http';
var baseUrl=serverProtocol+'://'+serverIp+':'+serverPort+'/';

// Endpoints
var addCompany= 'companies/add';
var editCompany= 'companies/edit';
var deleteCompany= 'companies/delete/';
var allCompany= 'companies/';
var allEndpointCompanies= 'companies/by-endpoint?endpointId=';


var allProject= 'projects/';
var deleteProject= 'projects/delete/';
var addProject= 'projects/add';
var editProject= 'projects/edit';

var endpointsByCompany= 'endpoints/by-company?companyId=';
var allProjectEndpoints= 'endpoints/by-project?projectId=';
var allEndpoint= 'endpoints/';
var deleteEndpoint= 'endpoints/delete/';
var addEndpoint= 'endpoints/add';
var editEndpoint= 'endpoints/edit';
var addCompanyToEndpoint= 'endpoints/add-company';
var deleteEndpointCompany= 'endpoints/delete/company'


function getLabel(contents,color){
    return isc.Label.create({
        ID: "topLabel",
        contents: contents,
        backgroundColor: color,
        width: "100%",
        height: "10%",
        align: "center",
        showShadow: true,
    })
}
