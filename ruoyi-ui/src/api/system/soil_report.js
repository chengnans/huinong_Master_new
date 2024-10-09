import request from '@/utils/request'

// 查询土壤分级报表列表
export function listSoil_report(query) {
  return request({
    url: '/system/soil_report/list',
    method: 'get',
    params: query
  })
}

// 查询土壤分级报表详细
export function getSoil_report(id) {
  return request({
    url: '/system/soil_report/' + id,
    method: 'get'
  })
}

// 新增土壤分级报表
export function addSoil_report(data) {
  return request({
    url: '/system/soil_report',
    method: 'post',
    data: data
  })
}

// 修改土壤分级报表
export function updateSoil_report(data) {
  return request({
    url: '/system/soil_report',
    method: 'put',
    data: data
  })
}

// 删除土壤分级报表
export function delSoil_report(id) {
  return request({
    url: '/system/soil_report/' + id,
    method: 'delete'
  })
}
