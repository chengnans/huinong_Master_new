import request from '@/utils/request'

// 查询音视频库列表
export function listVideo_library(query) {
  return request({
    url: '/system/video_library/list',
    method: 'get',
    params: query
  })
}

// 查询音视频库详细
export function getVideo_library(id) {
  return request({
    url: '/system/video_library/' + id,
    method: 'get'
  })
}

// 新增音视频库
export function addVideo_library(data) {
  return request({
    url: '/system/video_library',
    method: 'post',
    data: data
  })
}

// 修改音视频库
export function updateVideo_library(data) {
  return request({
    url: '/system/video_library',
    method: 'put',
    data: data
  })
}

// 删除音视频库
export function delVideo_library(id) {
  return request({
    url: '/system/video_library/' + id,
    method: 'delete'
  })
}
