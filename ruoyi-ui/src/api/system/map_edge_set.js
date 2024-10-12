import request from '@/utils/request'

// 查询地图边界配置列表
export function listMap_edge_set(query) {
  return request({
    url: '/system/map_edge_set/list',
    method: 'get',
    params: query
  })
}

// 查询地图边界配置详细
export function getMap_edge_set(id) {
  return request({
    url: '/system/map_edge_set/' + id,
    method: 'get'
  })
}

// 新增地图边界配置
export function addMap_edge_set(data) {
  return request({
    url: '/system/map_edge_set',
    method: 'post',
    data: data
  })
}

// 修改地图边界配置
export function updateMap_edge_set(data) {
  return request({
    url: '/system/map_edge_set',
    method: 'put',
    data: data
  })
}

// 删除地图边界配置
export function delMap_edge_set(id) {
  return request({
    url: '/system/map_edge_set/' + id,
    method: 'delete'
  })
}
