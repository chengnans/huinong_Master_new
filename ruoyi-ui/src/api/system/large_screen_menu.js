import request from '@/utils/request'

// 查询大屏菜单管理列表
export function listLarge_screen_menu(query) {
  return request({
    url: '/system/large_screen_menu/list',
    method: 'get',
    params: query
  })
}

// 查询大屏菜单管理详细
export function getLarge_screen_menu(id) {
  return request({
    url: '/system/large_screen_menu/' + id,
    method: 'get'
  })
}

// 新增大屏菜单管理
export function addLarge_screen_menu(data) {
  return request({
    url: '/system/large_screen_menu',
    method: 'post',
    data: data
  })
}

// 修改大屏菜单管理
export function updateLarge_screen_menu(data) {
  return request({
    url: '/system/large_screen_menu',
    method: 'put',
    data: data
  })
}

// 删除大屏菜单管理
export function delLarge_screen_menu(id) {
  return request({
    url: '/system/large_screen_menu/' + id,
    method: 'delete'
  })
}
