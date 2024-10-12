import request from '@/utils/request'

// 查询地图图标配置列表
export function listMap_icon_set(query) {
  return request({
    url: '/system/map_icon_set/list',
    method: 'get',
    params: query
  })
}

// 查询地图图标配置详细
export function getMap_icon_set(id) {
  return request({
    url: '/system/map_icon_set/' + id,
    method: 'get'
  })
}

// 新增地图图标配置
export function addMap_icon_set(data) {
  return request({
    url: '/system/map_icon_set',
    method: 'post',
    data: data
  })
}

// 修改地图图标配置
export function updateMap_icon_set(data) {
  return request({
    url: '/system/map_icon_set',
    method: 'put',
    data: data
  })
}

// 删除地图图标配置
export function delMap_icon_set(id) {
  return request({
    url: '/system/map_icon_set/' + id,
    method: 'delete'
  })
}
