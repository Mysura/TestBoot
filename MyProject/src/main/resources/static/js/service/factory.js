var factoryModule=angular.module('userFactoryModule',[]);
factoryModule.factory('userFactory',function($http){
	
	var ajaxFactory={};
    var responseData;
    
    ajaxFactory.ajaxCall=function(urlBase,method,data){
    	return $http({
			            url: urlBase,
			            method: method,
			            params: data
		            });
    }
    
    return ajaxFactory;
})