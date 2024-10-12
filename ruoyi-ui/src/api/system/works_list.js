import request from '@/utils/request'

// 查询作品列表列表
export function listWorks_list(query) {
  return request({
    url: '/system/works_list/list',
    method: 'get',
    params: query
  })
}

// 查询作品列表详细
export function getWorks_list(id) {
  return request({
    url: '/system/works_list/' + id,
    method: 'get'
  })
}

// 新增作品列表
export function addWorks_list(data) {
  return request({
    url: '/system/works_list',
    method: 'post',
    data: data
  })
}

// 修改作品列表
export function updateWorks_list(data) {
  return request({
    url: '/system/works_list',
    method: 'put',
    data: data
  })
}

// 删除作品列表
export function delWorks_list(id) {
  return request({
    url: '/system/works_list/' + id,
    method: 'delete'
  })
}
