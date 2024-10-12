import request from '@/utils/request'

// 查询图片库列表
export function listPhoto_library(query) {
  return request({
    url: '/system/photo_library/list',
    method: 'get',
    params: query
  })
}

// 查询图片库详细
export function getPhoto_library(id) {
  return request({
    url: '/system/photo_library/' + id,
    method: 'get'
  })
}

// 新增图片库
export function addPhoto_library(data) {
  return request({
    url: '/system/photo_library',
    method: 'post',
    data: data
  })
}

// 修改图片库
export function updatePhoto_library(data) {
  return request({
    url: '/system/photo_library',
    method: 'put',
    data: data
  })
}

// 删除图片库
export function delPhoto_library(id) {
  return request({
    url: '/system/photo_library/' + id,
    method: 'delete'
  })
}
