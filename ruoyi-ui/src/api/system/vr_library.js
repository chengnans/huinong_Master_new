import request from '@/utils/request'

// 查询VR库列表
export function listVr_library(query) {
  return request({
    url: '/system/vr_library/list',
    method: 'get',
    params: query
  })
}

// 查询VR库详细
export function getVr_library(id) {
  return request({
    url: '/system/vr_library/' + id,
    method: 'get'
  })
}

// 新增VR库
export function addVr_library(data) {
  return request({
    url: '/system/vr_library',
    method: 'post',
    data: data
  })
}

// 修改VR库
export function updateVr_library(data) {
  return request({
    url: '/system/vr_library',
    method: 'put',
    data: data
  })
}

// 删除VR库
export function delVr_library(id) {
  return request({
    url: '/system/vr_library/' + id,
    method: 'delete'
  })
}
