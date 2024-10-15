<template>
  <div id="container"></div>
</template>
<script>
import AMapLoader from "@amap/amap-jsapi-loader";

export default {
  name: "map-view",
  mounted() {
    this.initAMap();
      // 自适应
      // var browerWidth = window.innerWidth; //浏览器可视宽度
      // var baseWidth = 1920; //设计稿宽度
      // var zoomValue = browerWidth / baseWidth; //缩放比例计算
      // document.getElementById("container").style.transform = "scale(" + zoomValue + "," + zoomValue + ")"; //mainContainer为主容器id
      // window.onresize = function () { //窗口尺寸变化时，重新计算和缩放
      //   browerWidth = window.innerWidth;
      //   zoomValue = browerWidth / baseWidth;
      //   document.getElementById("container").style.transform = "scale(" + zoomValue + "," + zoomValue + ")";
      // }
  },
  unmounted() {
    this.map?.destroy();
  },
  methods: {
    initAMap() {
      window._AMapSecurityConfig = {
        securityJsCode: "0f7a51d8a0805f3a3e61dc6e07679d46",
      };
      AMapLoader.load({
        key: "6b35d31f0369f9d8bf310ea9f80c96e3", // 申请好的Web端开发者Key，首次调用 load 时必填
        version: "2.0", // 指定要加载的 JSAPI 的版本，缺省时默认为 1.4.15
        plugins: ["AMap.Scale"], //需要使用的的插件列表，如比例尺'AMap.Scale'，支持添加多个如：['...','...']
      })

        .then((AMap) => {
          this.map = new AMap.Map("container", {
            // 设置地图容器id
            viewMode: "2D", // 是否为3D地图模式
            zoom: 9, // 初始化地图级别
            center: [119.999258,36.620778], // 初始化地图中心点位置
          });
          //1.创建Marker对象
          // let marker = new window.AMap.Marker({
          //   position: [119.999258,36.620778],//要展示marker的经度、纬度。数据格式就是数组里放入经纬度数据
          //   icon: require("../assets/logo/logo.png"), //显示的图标
          //   title: "大厅车间",
          //   // content:  "qqqq",
          //   offset: [-16, -32],//图标偏移量，展示时会默认以图标的左上角为原点，不设置偏移量会导致地图放大缩小时造成图标偏移的情况，偏移量设置为图标宽度的负一半，负整个高度。
          // })
          //信息窗体的内容
          var content = [
            "<div><b>大河岔村基地</b>",
            "面积 : 422.81 亩",
            "设备 : 44台",
            "种植作物 : 冬小麦、小麦</div>",
          ];
          let infoWindow = new AMap.InfoWindow({
            content: content.join("<br>"), //传入字符串拼接的 DOM 元素
            anchor: "top-left",
            position: [119.999258,36.620778],
          });
          // this.map.add(marker);
          this.map.add(infoWindow);
          // infoWindow.open(map, [116.401337, 39.907886]);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>
<style scoped>
#container {
  width: 90vw;
  height: 90vh;
}
</style>
