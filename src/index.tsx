import { NativeModules } from 'react-native';

type RNBadgeCount = {
  setBadgeNumber(count: number): void;
};

const { RnBadge } = NativeModules;

export default RnBadge as RNBadgeCount;
