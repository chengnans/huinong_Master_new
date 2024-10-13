import request from '@/utils/request'

// 查询农机站点列表
export function listFarm_machine(query) {
  return request({
    url: '/system/farm_machine/list',
    method: 'get',
    params: query
  })
}

// 查询农机站点详细
export function getFarm_machine(id) {
  return request({
    url: '/system/farm_machine/' + id,
    method: 'get'
  })
}

// 新增农机站点
export function addFarm_machine(data) {
  return request({
    url: '/system/farm_machine',
    method: 'post',
    data: data
  })
}

// 修改农机站点
export function updateFarm_machine(data) {
  return request({
    url: '/system/farm_machine',
    method: 'put',
    data: data
  })
}

// 删除农机站点
export function delFarm_machine(id) {
  return request({
    url: '/system/farm_machine/' + id,
    method: 'delete'
  })
}
