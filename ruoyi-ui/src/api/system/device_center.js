import request from '@/utils/request'

// 查询设备中心列表
export function listDevice_center(query) {
  return request({
    url: '/system/device_center/list',
    method: 'get',
    params: query
  })
}

// 查询设备中心详细
export function getDevice_center(IMEI) {
  return request({
    url: '/system/device_center/' + IMEI,
    method: 'get'
  })
}

// 新增设备中心
export function addDevice_center(data) {
  return request({
    url: '/system/device_center',
    method: 'post',
    data: data
  })
}

// 修改设备中心
export function updateDevice_center(data) {
  return request({
    url: '/system/device_center',
    method: 'put',
    data: data
  })
}

// 删除设备中心
export function delDevice_center(IMEI) {
  return request({
    url: '/system/device_center/' + IMEI,
    method: 'delete'
  })
}
