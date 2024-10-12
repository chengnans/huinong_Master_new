import request from '@/utils/request'

// 查询文化融合列表
export function listCulture(query) {
  return request({
    url: '/system/culture/list',
    method: 'get',
    params: query
  })
}

// 查询文化融合详细
export function getCulture(id) {
  return request({
    url: '/system/culture/' + id,
    method: 'get'
  })
}

// 新增文化融合
export function addCulture(data) {
  return request({
    url: '/system/culture',
    method: 'post',
    data: data
  })
}

// 修改文化融合
export function updateCulture(data) {
  return request({
    url: '/system/culture',
    method: 'put',
    data: data
  })
}

// 删除文化融合
export function delCulture(id) {
  return request({
    url: '/system/culture/' + id,
    method: 'delete'
  })
}
