import request from '@/utils/request'

// 查询通用菜单配置列表
export function listGeneral_menu_set(query) {
  return request({
    url: '/system/general_menu_set/list',
    method: 'get',
    params: query
  })
}

// 查询通用菜单配置详细
export function getGeneral_menu_set(id) {
  return request({
    url: '/system/general_menu_set/' + id,
    method: 'get'
  })
}

// 新增通用菜单配置
export function addGeneral_menu_set(data) {
  return request({
    url: '/system/general_menu_set',
    method: 'post',
    data: data
  })
}

// 修改通用菜单配置
export function updateGeneral_menu_set(data) {
  return request({
    url: '/system/general_menu_set',
    method: 'put',
    data: data
  })
}

// 删除通用菜单配置
export function delGeneral_menu_set(id) {
  return request({
    url: '/system/general_menu_set/' + id,
    method: 'delete'
  })
}
