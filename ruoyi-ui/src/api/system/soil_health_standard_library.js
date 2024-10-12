import request from '@/utils/request'

// 查询土壤健康标准库列表
export function listSoil_health_standard_library(query) {
  return request({
    url: '/system/soil_health_standard_library/list',
    method: 'get',
    params: query
  })
}

// 查询土壤健康标准库详细
export function getSoil_health_standard_library(id) {
  return request({
    url: '/system/soil_health_standard_library/' + id,
    method: 'get'
  })
}

// 新增土壤健康标准库
export function addSoil_health_standard_library(data) {
  return request({
    url: '/system/soil_health_standard_library',
    method: 'post',
    data: data
  })
}

// 修改土壤健康标准库
export function updateSoil_health_standard_library(data) {
  return request({
    url: '/system/soil_health_standard_library',
    method: 'put',
    data: data
  })
}

// 删除土壤健康标准库
export function delSoil_health_standard_library(id) {
  return request({
    url: '/system/soil_health_standard_library/' + id,
    method: 'delete'
  })
}
