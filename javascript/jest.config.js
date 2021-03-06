module.exports = {
  preset: 'ts-jest',
  testEnvironment: 'node',
  testMatch: [
    '<rootDir>/test/**/*.(test).{js,jsx,ts,tsx}',
    '<rootDir>/src/**/?(*.)(spec|test).{js,jsx,ts,tsx}',
  ],
  modulePathIgnorePatterns: ['<rootDir>/dist/', '<rootDir>/data/', '<rootDir>/node_modules/'],
};
