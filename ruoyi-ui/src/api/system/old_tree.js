import request from '@/utils/request'

// 查询古树管理列表
export function listOld_tree(query) {
  return request({
    url: '/system/old_tree/list',
    method: 'get',
    params: query
  })
}

// 查询古树管理详细
export function getOld_tree(id) {
  return request({
    url: '/system/old_tree/' + id,
    method: 'get'
  })
}

// 新增古树管理
export function addOld_tree(data) {
  return request({
    url: '/system/old_tree',
    method: 'post',
    data: data
  })
}

// 修改古树管理
export function updateOld_tree(data) {
  return request({
    url: '/system/old_tree',
    method: 'put',
    data: data
  })
}

// 删除古树管理
export function delOld_tree(id) {
  return request({
    url: '/system/old_tree/' + id,
    method: 'delete'
  })
}
