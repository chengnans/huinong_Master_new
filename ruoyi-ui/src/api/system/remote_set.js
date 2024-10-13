import request from '@/utils/request'

// 查询遥感服务配置列表
export function listRemote_set(query) {
  return request({
    url: '/system/remote_set/list',
    method: 'get',
    params: query
  })
}

// 查询遥感服务配置详细
export function getRemote_set(id) {
  return request({
    url: '/system/remote_set/' + id,
    method: 'get'
  })
}

// 新增遥感服务配置
export function addRemote_set(data) {
  return request({
    url: '/system/remote_set',
    method: 'post',
    data: data
  })
}

// 修改遥感服务配置
export function updateRemote_set(data) {
  return request({
    url: '/system/remote_set',
    method: 'put',
    data: data
  })
}

// 删除遥感服务配置
export function delRemote_set(id) {
  return request({
    url: '/system/remote_set/' + id,
    method: 'delete'
  })
}
