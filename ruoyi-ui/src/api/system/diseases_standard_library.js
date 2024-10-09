import request from '@/utils/request'

// 查询病虫害标准库列表
export function listDiseases_standard_library(query) {
  return request({
    url: '/system/diseases_standard_library/list',
    method: 'get',
    params: query
  })
}

// 查询病虫害标准库详细
export function getDiseases_standard_library(id) {
  return request({
    url: '/system/diseases_standard_library/' + id,
    method: 'get'
  })
}

// 新增病虫害标准库
export function addDiseases_standard_library(data) {
  return request({
    url: '/system/diseases_standard_library',
    method: 'post',
    data: data
  })
}

// 修改病虫害标准库
export function updateDiseases_standard_library(data) {
  return request({
    url: '/system/diseases_standard_library',
    method: 'put',
    data: data
  })
}

// 删除病虫害标准库
export function delDiseases_standard_library(id) {
  return request({
    url: '/system/diseases_standard_library/' + id,
    method: 'delete'
  })
}
