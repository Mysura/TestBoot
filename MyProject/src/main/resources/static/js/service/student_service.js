var factoryModule=angular.module('StudentFactoryModule',[]);
factoryModule.factory('StudentService',function($http){
	
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