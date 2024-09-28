import request from '@/utils/request'

// 查询耕地质量列表
export function listLandQuality(query) {
  return request({
    url: '/system/landQuality/list',
    method: 'get',
    params: query
  })
}

// 查询耕地质量详细
export function getLandQuality(id) {
  return request({
    url: '/system/landQuality/' + id,
    method: 'get'
  })
}

// 新增耕地质量
export function addLandQuality(data) {
  return request({
    url: '/system/landQuality',
    method: 'post',
    data: data
  })
}

// 修改耕地质量
export function updateLandQuality(data) {
  return request({
    url: '/system/landQuality',
    method: 'put',
    data: data
  })
}

// 删除耕地质量
export function delLandQuality(id) {
  return request({
    url: '/system/landQuality/' + id,
    method: 'delete'
  })
}
