import request from '@/utils/request'

// 查询土壤检测记录列表
export function listSoil_monitor_record(query) {
  return request({
    url: '/system/soil_monitor_record/list',
    method: 'get',
    params: query
  })
}

// 查询土壤检测记录详细
export function getSoil_monitor_record(id) {
  return request({
    url: '/system/soil_monitor_record/' + id,
    method: 'get'
  })
}

// 新增土壤检测记录
export function addSoil_monitor_record(data) {
  return request({
    url: '/system/soil_monitor_record',
    method: 'post',
    data: data
  })
}

// 修改土壤检测记录
export function updateSoil_monitor_record(data) {
  return request({
    url: '/system/soil_monitor_record',
    method: 'put',
    data: data
  })
}

// 删除土壤检测记录
export function delSoil_monitor_record(id) {
  return request({
    url: '/system/soil_monitor_record/' + id,
    method: 'delete'
  })
}
