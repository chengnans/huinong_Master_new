import request from '@/utils/request'

// 查询遥感图片列表
export function listPhotos(query) {
  return request({
    url: '/system/photos/list',
    method: 'get',
    params: query
  })
}

// 查询遥感图片详细
export function getPhotos(id) {
  return request({
    url: '/system/photos/' + id,
    method: 'get'
  })
}

// 新增遥感图片
export function addPhotos(data) {
  return request({
    url: '/system/photos',
    method: 'post',
    data: data
  })
}

// 修改遥感图片
export function updatePhotos(data) {
  return request({
    url: '/system/photos',
    method: 'put',
    data: data
  })
}

// 删除遥感图片
export function delPhotos(id) {
  return request({
    url: '/system/photos/' + id,
    method: 'delete'
  })
}
