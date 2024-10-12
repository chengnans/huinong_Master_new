import request from '@/utils/request'

// 查询大屏基础设置列表
export function listLarge_screen_set(query) {
  return request({
    url: '/system/large_screen_set/list',
    method: 'get',
    params: query
  })
}

// 查询大屏基础设置详细
export function getLarge_screen_set(id) {
  return request({
    url: '/system/large_screen_set/' + id,
    method: 'get'
  })
}

// 新增大屏基础设置
export function addLarge_screen_set(data) {
  return request({
    url: '/system/large_screen_set',
    method: 'post',
    data: data
  })
}

// 修改大屏基础设置
export function updateLarge_screen_set(data) {
  return request({
    url: '/system/large_screen_set',
    method: 'put',
    data: data
  })
}

// 删除大屏基础设置
export function delLarge_screen_set(id) {
  return request({
    url: '/system/large_screen_set/' + id,
    method: 'delete'
  })
}
