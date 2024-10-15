<template>
  <div style="width: 95vw;height: 90vh;border: black ;position: absolute;top: 8px;left: 8px;font-size: 20px;overflow:auto;overflow-x: hidden;
" >

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 10px;left: 20px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/5ee2a79836a482f2d76ec530f900590dee512f2283feb-ekXtRj_fw1200webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>基地个数：1</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 10px;left: 500px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/70e177f8b528e1f5e2a46aae2727c01f643921875470e-rh1XCp_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>地块数量：2</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 10px;left: 980px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/e8f0b396bb5c585572d145f2ffeb8d1c1d6ada381fa41-yuEjDU_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>基地面积：422.81亩</span>

      </div>
    </el-card>


    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 230px;left: 20px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/177447bc76edeea96b0eeda3fed1487f0e75f395882594-YhfsuU_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>种植面积：335.85</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 230px;left: 500px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/46eb80d866eaa83ffd5aee71a8064b05a2f1a4131f8e0-M8u81S_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>农作物种类：2</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 230px;left: 980px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/5171cf706b7d38954fd6607d19807e91153032e3854a8-xiFvcN_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>用户数量：2</span>

      </div>
    </el-card>



    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 440px;left: 20px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/784377e1ff294fca870b170c123241b32f9e0437894a3-YIPWHi_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>设备数量：44</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 440px;left: 500px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/a43b4a0799de0ba333eeede8336ee749b49bea6618162-6RsvBY_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>监测预警（最近一周）：153</span>

      </div>
    </el-card>

    <el-card :body-style="{ padding: '0px' }" style="position: absolute;top: 440px;left: 980px;width: 450px;height: 200px">
      <img src="https://gd-hbimg.huaban.com/b12c8799d5cedb67adec5da100cb439f902d164d2dea3b-PoWkhy_fw480webp" class="image" style="height: 150px;width: 450px">
      <div style="padding: 14px;">
        <span>病虫害识别：579</span>

      </div>
    </el-card>
    <div style="position: absolute;top: 670px;width: 1454px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)">
      <div style="position: relative;left: 600px">
        <el-icon size="30px"><CameraFilled /></el-icon>
        <span style="position: relative;top: 1px">

        实时监测
      </span>

      </div>

      <el-table
        :data="tableData"
        style="width: 1454px;position: absolute;height: 300px"
        :row-class-name="tableRowClassName"

      >
        <el-table-column prop="date" label="时间" width="180" />
        <el-table-column prop="base" label="基地" width="180" />
        <el-table-column prop="di" label="地块" />
        <el-table-column prop="corn" label="作物" />
        <el-table-column prop="MAC" label="MAC" />

        <el-table-column prop="leibie" label="监测类别" />
        <el-table-column prop="canshu" label="监测参数" />
        <el-table-column prop="jiance" label="监测值" />
        <el-table-column prop="stat" label="状态" />


      </el-table>

    </div>




    <div style="position: absolute;top: 1050px;width: 1454px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)">
      <div style="position: relative;left: 600px">
        <el-icon size="30"><VideoCameraFilled /></el-icon>      <span style="position: relative;top: 1px">

       病虫监测
      </span>

      </div>

      <el-table
        :data="tableData1"
        style="width: 1454px;position: absolute;height: 300px"
        :row-class-name="tableRowClassName"

      >
        <el-table-column prop="date" label="时间" width="180" />
        <el-table-column prop="base" label="基地" width="180" />
        <el-table-column prop="di" label="地块" />
        <el-table-column prop="corn" label="作物" />
        <el-table-column prop="enter" label="设备" />
        <el-table-column prop="leibie" label="监测类别" />
        <el-table-column prop="canshu" label="监测结果" />
        <el-table-column prop="jiance" label="中文名" />
        <el-table-column prop="stat" label="可信度" />


      </el-table>

    </div>

    <div style="position: absolute;top: 1350px;width: 500px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)">
      <div style="position: relative;left: 160px">
        <el-icon size="30px"><Monitor /></el-icon>

        <span style="position: relative;top: 1px">

        设备运行情况
      </span>
        <div style="height: 300px;width: 300px;position: relative;left: -70px" id="main"></div>
      </div>
      <div style="height: 30px"></div>

    </div>

    <div style="position: absolute;top: 1350px;width: 900px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);left:520px">
      <div style="position: relative;left: 350px">
        <el-icon size="30px"><Coordinate /></el-icon>
        <span style="position: relative;top: 1px">
        种植面积-Top10
      </span>
      </div>
      <div style="height: 30px"></div>
      <el-table
        :data="tableData2"
        style="width: 1454px;position: absolute;height: 300px"
        :row-class-name="tableRowClassName"

      >
        <el-table-column prop="id" label="ID" width="180" />
        <el-table-column prop="name" label="品种" width="180" />
        <el-table-column prop="area" label="面积" />



      </el-table>
    </div>

    <div style="position: absolute;top: 1750px;width: 700px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)">
      <div style="position: relative;left: 260px">
        <el-icon size="30px"><Monitor /></el-icon>

        <span style="position: relative;top: 1px">

        用户增长
      </span>
        <div style="height: 400px;width: 600px;position: relative;left: -220px;top: -30px" id="main3"></div>
      </div>
      <div style="height: 30px"></div>

    </div>

    <div style="position: absolute;top: 1750px;width: 700px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);left: 720px">
      <div style="position: relative;left: 260px">
        <el-icon size="30px"><Monitor /></el-icon>

        <span style="position: relative;top: 1px">

        近一周基地评级
      </span>
        <div style="height: 400px;width: 300px;position: relative;left: -70px" >
          <el-empty description="暂无数据" />

        </div>
      </div>
      <div style="height: 30px"></div>

    </div>

    <div style="position: absolute;top: 2250px;width: 700px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)">
      <div style="position: relative;left: 260px">
        <el-icon size="30px"><Monitor /></el-icon>

        <span style="position: relative;top: 1px">

        农产品分级
      </span>
        <div style="height: 400px;width:600px;position: relative;left: -220px;top: 20px" id="main4"></div>
      </div>
      <div style="height: 30px"></div>

    </div>

    <div style="position: absolute;top: 2250px;width: 700px;box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);left: 720px">
      <div style="position: relative;left: 260px">
        <el-icon size="30px"><Monitor /></el-icon>

        <span style="position: relative;top: 1px">

        土壤分级
      </span>

        <div style="height: 400px;width: 300px;position: relative;left: -70px" >
          <el-empty description="暂无数据" />

        </div>
      </div>
      <div style="height: 30px"></div>

    </div>


  </div>

</template>

<script>
import { ECharts } from 'echarts';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import * as echarts from "echarts";

export default {
  name: 'index',
  components: {
    // 导入其他组件
  },
  data() {
    return {
      tableData : [
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          MAC:'d8:90:f3:64:aa:d2',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%',
        },
        {date:"07-01 23:57:18",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          MAC:'d8:90:f3:64:aa:d2',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%',
        },
      ],
      tableData1 : [
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          enter:'虫情灯',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%'
        },
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          enter:'虫情灯',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%'
        },
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          enter:'虫情灯',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%'
        },
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          enter:'虫情灯',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%'
        },
        {date:"07-01 23:57:14",
          base:'大河岔村基地',
          di:'--',
          corn:'--',
          enter:'虫情灯',
          leibie:'病虫害',
          canshu:'虫害',
          jiance:'铜绿丽金龟',
          stat:'99.99%'
        },
      ],
      tableData2 : [
        {id:1,
          name:'小麦',
          area:'192.5亩'

        },
        {id:2,
          name:'冬小麦',
          area:'136.1亩'

        },
        {id:3,
          name:'大麦',
          area:'76.6亩'

        },
        {id:2,
          name:'水稻',
          area:'36.1亩'

        },
      ]

      // 其他需要的数据
    };
  },
  methods: {
    tableRowClassName({ row, rowIndex }) {
      // 设置行样式的方法
    },
    initCharts() {
      // 初始化图表
      var chartDom = document.getElementById('main');
      var myChart = echarts.init(chartDom);
      var option;

      option = {
        tooltip: {
          trigger: 'item'
        },

        series: [
          {
            name: '设备运行状况',
            type: 'pie',
            radius: ['40%', '70%'],
            avoidLabelOverlap: false,
            itemStyle: {
              borderRadius: 10,
              borderColor: '#fff',
              borderWidth: 2
            },
            label: {
              show: true,
              position: 'center'
            },
            emphasis: {
              label: {
                show: true,
                fontSize: 40,
                fontWeight: 'bold'
              }
            },
            labelLine: {
              show: false
            },
            data: [
              { value: 100, name: '100%' },

            ]
          }
        ]
      };

      option && myChart.setOption(option);
      var chartDom1 = document.getElementById('main4');
      var myChart1 = echarts.init(chartDom1);
      var option1;
      option1 = {
        title : {
          text: '农产品分级',
          subtext: '数据来自网络'
        },
        tooltip : {
          trigger: 'axis',
          formatter: '{c}'+ "%"

        },
        toolbox: {
          show : true,
          feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType: {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
          }
        },
        calculable : true,
        xAxis : [
          {
            type : 'value',
            boundaryGap : [0, 0.01]
          }
        ],
        yAxis : [
          {
            type : 'category',
            data : ['优等','良好','中等','较差']
          }
        ],
        series : [

          {
            type:'bar',
            data:[11.2, 22.4, 33.6, 32.8],
            itemStyle: {
              normal: {
                color: function (params) {
                  let colorList = [

                    '#D0E6A5',
                    '#FFA876',
                    '#4675C0',
                    '#FA897B',
                    '#FFDD94',
                    '#FFDD94',
                    '#B8BFD6',
                  ];
                  let colorItem = colorList[params.dataIndex];
                  return colorItem;
                }
              }
            }
          },

        ]
      };
      option1 && myChart1.setOption(option1);
      var chartDom2 = document.getElementById('main3');
      var myChart2 = echarts.init(chartDom2);
      var option2;

      option2 = {
        tooltip : {
          trigger: 'axis',
          formatter: '{c}'+'人'

        },
        xAxis: {
          type: 'category',
          data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
        },
        yAxis: {
          type: 'value'
        },
        series: [
          {
            data: [60, 70, 70, 70, 70, 70, 70],
            type: 'line',
            smooth: true,
            itemStyle:{
              normal:{
                color:'FFDD94'
              }
            }
          }
        ]
      };

      option2 && myChart2.setOption(option2);
      if (option) {
        myChart.setOption(option);
      }
      // 初始化其他图表

    }
  },
  mounted() {
    this.initCharts();
  }
};
</script>
