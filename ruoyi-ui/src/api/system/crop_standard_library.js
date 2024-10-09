import request from '@/utils/request'

// 查询种植业标准库列表
export function listCrop_standard_library(query) {
  return request({
    url: '/system/crop_standard_library/list',
    method: 'get',
    params: query
  })
}

// 查询种植业标准库详细
export function getCrop_standard_library(id) {
  return request({
    url: '/system/crop_standard_library/' + id,
    method: 'get'
  })
}

// 新增种植业标准库
export function addCrop_standard_library(data) {
  return request({
    url: '/system/crop_standard_library',
    method: 'post',
    data: data
  })
}

// 修改种植业标准库
export function updateCrop_standard_library(data) {
  return request({
    url: '/system/crop_standard_library',
    method: 'put',
    data: data
  })
}

// 删除种植业标准库
export function delCrop_standard_library(id) {
  return request({
    url: '/system/crop_standard_library/' + id,
    method: 'delete'
  })
}
