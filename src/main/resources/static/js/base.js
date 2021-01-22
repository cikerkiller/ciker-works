
init();
/**
 * 获取项目根地址
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 16:07
 */
function getContextPath(){
  var pathName = window.location.pathname.substring(1);
  /*var webName = !pathName ? '' : pathName.substring(0, pathName.indexOf('/'));
  if (webName) {
      return window.location.protocol + '//' + window.location.host + '/' + webName;
  }*/
  return window.location.protocol + '//' + window.location.host;
}
/**
 * 初始化
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 16:07
 */
function init(){
    document.write(' <link rel="stylesheet" href="'+getContextPath()+'/lib/layui-v2.5.7/layui/css/layui.css"  media="all">');
    document.write('<script type="text/javascript" src="'+getContextPath()+'/lib/layui-v2.5.7/layui/layui.js"></script>');
}
